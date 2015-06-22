package vn.com.ecopharma.hrm.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.CharPool;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.com.ecopharma.hrm.NoSuchEmployeeException;
import vn.com.ecopharma.hrm.model.Employee;
import vn.com.ecopharma.hrm.model.impl.EmployeeImpl;
import vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl;
import vn.com.ecopharma.hrm.service.persistence.EmployeePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
    implements EmployeePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAME = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "countByName",
            new String[] {
                String.class.getName(), String.class.getName(),
                String.class.getName()
            });
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_1 = "employee.firstname LIKE NULL AND ";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_2 = "employee.firstname LIKE ? AND ";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_3 = "(employee.firstname IS NULL OR employee.firstname LIKE '') AND ";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_FIRSTNAME_1) + ")";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_FIRSTNAME_2) + ")";
    private static final String _FINDER_COLUMN_NAME_FIRSTNAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_FIRSTNAME_3) + ")";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_1 = "employee.middle_name LIKE NULL AND ";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_2 = "employee.middle_name LIKE ? AND ";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_3 = "(employee.middle_name IS NULL OR employee.middle_name LIKE '') AND ";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_MIDDLE_NAME_1) + ")";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_MIDDLE_NAME_2) + ")";
    private static final String _FINDER_COLUMN_NAME_MIDDLE_NAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_MIDDLE_NAME_3) + ")";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_1 = "employee.lastname LIKE NULL";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_2 = "employee.lastname LIKE ?";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_3 = "(employee.lastname IS NULL OR employee.lastname LIKE '')";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_4 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_LASTNAME_1) + ")";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_5 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_LASTNAME_2) + ")";
    private static final String _FINDER_COLUMN_NAME_LASTNAME_6 = "(" +
        removeConjunction(_FINDER_COLUMN_NAME_LASTNAME_3) + ")";
    private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
    private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
    private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
    private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
    private static Employee _nullEmployee = new EmployeeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employee> toCacheModel() {
                return _nullEmployeeCacheModel;
            }
        };

    private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
            @Override
            public Employee toEntityModel() {
                return _nullEmployee;
            }
        };

    public EmployeePersistenceImpl() {
        setModelClass(Employee.class);
    }

    /**
     * Returns all the employees where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String firstname, String middle_name,
        String lastname) throws SystemException {
        return findByName(firstname, middle_name, lastname, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employees where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @return the range of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String firstname, String middle_name,
        String lastname, int start, int end) throws SystemException {
        return findByName(firstname, middle_name, lastname, start, end, null);
    }

    /**
     * Returns an ordered range of all the employees where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String firstname, String middle_name,
        String lastname, int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
        finderArgs = new Object[] {
                firstname, middle_name, lastname,
                
                start, end, orderByComparator
            };

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if (!StringUtil.wildcardMatches(employee.getFirstname(),
                            firstname, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !StringUtil.wildcardMatches(employee.getMiddle_name(),
                            middle_name, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true) ||
                        !StringUtil.wildcardMatches(employee.getLastname(),
                            lastname, CharPool.UNDERLINE, CharPool.PERCENT,
                            CharPool.BACK_SLASH, true)) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(5 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(5);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            boolean bindFirstname = false;

            if (firstname == null) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
            } else if (firstname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
            } else {
                bindFirstname = true;

                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
            }

            boolean bindMiddle_name = false;

            if (middle_name == null) {
                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_1);
            } else if (middle_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_3);
            } else {
                bindMiddle_name = true;

                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_2);
            }

            boolean bindLastname = false;

            if (lastname == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
            } else if (lastname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
            } else {
                bindLastname = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirstname) {
                    qPos.add(firstname);
                }

                if (bindMiddle_name) {
                    qPos.add(middle_name);
                }

                if (bindLastname) {
                    qPos.add(lastname);
                }

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Returns the first employee in the ordered set where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByName_First(String firstname, String middle_name,
        String lastname, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByName_First(firstname, middle_name, lastname,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("firstname=");
        msg.append(firstname);

        msg.append(", middle_name=");
        msg.append(middle_name);

        msg.append(", lastname=");
        msg.append(lastname);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByName_First(String firstname, String middle_name,
        String lastname, OrderByComparator orderByComparator)
        throws SystemException {
        List<Employee> list = findByName(firstname, middle_name, lastname, 0,
                1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last employee in the ordered set where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByName_Last(String firstname, String middle_name,
        String lastname, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByName_Last(firstname, middle_name, lastname,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(8);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("firstname=");
        msg.append(firstname);

        msg.append(", middle_name=");
        msg.append(middle_name);

        msg.append(", lastname=");
        msg.append(lastname);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByName_Last(String firstname, String middle_name,
        String lastname, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByName(firstname, middle_name, lastname);

        if (count == 0) {
            return null;
        }

        List<Employee> list = findByName(firstname, middle_name, lastname,
                count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the employees before and after the current employee in the ordered set where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param employeeId the primary key of the current employee
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next employee
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee[] findByName_PrevAndNext(long employeeId, String firstname,
        String middle_name, String lastname, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(employeeId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByName_PrevAndNext(session, employee, firstname,
                    middle_name, lastname, orderByComparator, true);

            array[1] = employee;

            array[2] = getByName_PrevAndNext(session, employee, firstname,
                    middle_name, lastname, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByName_PrevAndNext(Session session,
        Employee employee, String firstname, String middle_name,
        String lastname, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        boolean bindFirstname = false;

        if (firstname == null) {
            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
        } else if (firstname.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
        } else {
            bindFirstname = true;

            query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
        }

        boolean bindMiddle_name = false;

        if (middle_name == null) {
            query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_1);
        } else if (middle_name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_3);
        } else {
            bindMiddle_name = true;

            query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_2);
        }

        boolean bindLastname = false;

        if (lastname == null) {
            query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
        } else if (lastname.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
        } else {
            bindLastname = true;

            query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindFirstname) {
            qPos.add(firstname);
        }

        if (bindMiddle_name) {
            qPos.add(middle_name);
        }

        if (bindLastname) {
            qPos.add(lastname);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where firstname LIKE any &#63; and middle_name LIKE any &#63; and lastname LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param firstnames the firstnames
     * @param middle_names the middle_names
     * @param lastname the lastname
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String[] firstnames,
        String[] middle_names, String lastname) throws SystemException {
        return findByName(firstnames, middle_names, lastname,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employees where firstname LIKE any &#63; and middle_name LIKE any &#63; and lastname LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param firstnames the firstnames
     * @param middle_names the middle_names
     * @param lastname the lastname
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @return the range of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String[] firstnames,
        String[] middle_names, String lastname, int start, int end)
        throws SystemException {
        return findByName(firstnames, middle_names, lastname, start, end, null);
    }

    /**
     * Returns an ordered range of all the employees where firstname LIKE any &#63; and middle_name LIKE any &#63; and lastname LIKE &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param firstnames the firstnames
     * @param middle_names the middle_names
     * @param lastname the lastname
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByName(String[] firstnames,
        String[] middle_names, String lastname, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        if ((firstnames != null) && (firstnames.length == 1) &&
                (middle_names != null) && (middle_names.length == 1)) {
            return findByName(firstnames[0], middle_names[0], lastname, start,
                end, orderByComparator);
        }

        boolean pagination = true;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderArgs = new Object[] {
                    StringUtil.merge(firstnames), StringUtil.merge(middle_names),
                    lastname
                };
        } else {
            finderArgs = new Object[] {
                    StringUtil.merge(firstnames), StringUtil.merge(middle_names),
                    lastname,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if (!ArrayUtil.contains(firstnames, employee.getFirstname()) ||
                        !ArrayUtil.contains(middle_names,
                            employee.getMiddle_name()) ||
                        !Validator.equals(lastname, employee.getLastname())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            boolean conjunctionable = false;

            if ((firstnames == null) || (firstnames.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < firstnames.length; i++) {
                    String firstname = firstnames[i];

                    if (firstname == null) {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_4);
                    } else if (firstname.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_5);
                    }

                    if ((i + 1) < firstnames.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((middle_names == null) || (middle_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < middle_names.length; i++) {
                    String middle_name = middle_names[i];

                    if (middle_name == null) {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_4);
                    } else if (middle_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_5);
                    }

                    if ((i + 1) < middle_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindLastname = false;

            if (lastname == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_4);
            } else if (lastname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_6);
            } else {
                bindLastname = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_5);
            }

            conjunctionable = true;

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (firstnames != null) {
                    qPos.add(firstnames);
                }

                if (middle_names != null) {
                    qPos.add(middle_names);
                }

                if (bindLastname) {
                    qPos.add(lastname);
                }

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME,
                    finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employees where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63; from the database.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByName(String firstname, String middle_name,
        String lastname) throws SystemException {
        for (Employee employee : findByName(firstname, middle_name, lastname,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees where firstname LIKE &#63; and middle_name LIKE &#63; and lastname LIKE &#63;.
     *
     * @param firstname the firstname
     * @param middle_name the middle_name
     * @param lastname the lastname
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String firstname, String middle_name, String lastname)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { firstname, middle_name, lastname };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            boolean bindFirstname = false;

            if (firstname == null) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_1);
            } else if (firstname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_3);
            } else {
                bindFirstname = true;

                query.append(_FINDER_COLUMN_NAME_FIRSTNAME_2);
            }

            boolean bindMiddle_name = false;

            if (middle_name == null) {
                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_1);
            } else if (middle_name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_3);
            } else {
                bindMiddle_name = true;

                query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_2);
            }

            boolean bindLastname = false;

            if (lastname == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_1);
            } else if (lastname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_3);
            } else {
                bindLastname = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindFirstname) {
                    qPos.add(firstname);
                }

                if (bindMiddle_name) {
                    qPos.add(middle_name);
                }

                if (bindLastname) {
                    qPos.add(lastname);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where firstname LIKE any &#63; and middle_name LIKE any &#63; and lastname LIKE &#63;.
     *
     * @param firstnames the firstnames
     * @param middle_names the middle_names
     * @param lastname the lastname
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String[] firstnames, String[] middle_names,
        String lastname) throws SystemException {
        Object[] finderArgs = new Object[] {
                StringUtil.merge(firstnames), StringUtil.merge(middle_names),
                lastname
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAME,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler();

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            boolean conjunctionable = false;

            if ((firstnames == null) || (firstnames.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < firstnames.length; i++) {
                    String firstname = firstnames[i];

                    if (firstname == null) {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_4);
                    } else if (firstname.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_NAME_FIRSTNAME_5);
                    }

                    if ((i + 1) < firstnames.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if ((middle_names == null) || (middle_names.length > 0)) {
                if (conjunctionable) {
                    query.append(WHERE_AND);
                }

                query.append(StringPool.OPEN_PARENTHESIS);

                for (int i = 0; i < middle_names.length; i++) {
                    String middle_name = middle_names[i];

                    if (middle_name == null) {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_4);
                    } else if (middle_name.equals(StringPool.BLANK)) {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_6);
                    } else {
                        query.append(_FINDER_COLUMN_NAME_MIDDLE_NAME_5);
                    }

                    if ((i + 1) < middle_names.length) {
                        query.append(WHERE_OR);
                    }
                }

                query.append(StringPool.CLOSE_PARENTHESIS);

                conjunctionable = true;
            }

            if (conjunctionable) {
                query.append(WHERE_AND);
            }

            boolean bindLastname = false;

            if (lastname == null) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_4);
            } else if (lastname.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_LASTNAME_6);
            } else {
                bindLastname = true;

                query.append(_FINDER_COLUMN_NAME_LASTNAME_5);
            }

            conjunctionable = true;

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (firstnames != null) {
                    qPos.add(firstnames);
                }

                if (middle_names != null) {
                    qPos.add(middle_names);
                }

                if (bindLastname) {
                    qPos.add(lastname);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAME,
                    finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_WITH_PAGINATION_COUNT_BY_NAME,
                    finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the employee in the entity cache if it is enabled.
     *
     * @param employee the employee
     */
    @Override
    public void cacheResult(Employee employee) {
        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        employee.resetOriginalValues();
    }

    /**
     * Caches the employees in the entity cache if it is enabled.
     *
     * @param employees the employees
     */
    @Override
    public void cacheResult(List<Employee> employees) {
        for (Employee employee : employees) {
            if (EntityCacheUtil.getResult(
                        EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, employee.getPrimaryKey()) == null) {
                cacheResult(employee);
            } else {
                employee.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmployeeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employee employee) {
        EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Employee> employees) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employee employee : employees) {
            EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, employee.getPrimaryKey());
        }
    }

    /**
     * Creates a new employee with the primary key. Does not add the employee to the database.
     *
     * @param employeeId the primary key for the new employee
     * @return the new employee
     */
    @Override
    public Employee create(long employeeId) {
        Employee employee = new EmployeeImpl();

        employee.setNew(true);
        employee.setPrimaryKey(employeeId);

        return employee;
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employeeId the primary key of the employee
     * @return the employee that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee remove(long employeeId)
        throws NoSuchEmployeeException, SystemException {
        return remove((Serializable) employeeId);
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee that was removed
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee remove(Serializable primaryKey)
        throws NoSuchEmployeeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employee employee = (Employee) session.get(EmployeeImpl.class,
                    primaryKey);

            if (employee == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employee);
        } catch (NoSuchEmployeeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employee removeImpl(Employee employee) throws SystemException {
        employee = toUnwrappedModel(employee);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employee)) {
                employee = (Employee) session.get(EmployeeImpl.class,
                        employee.getPrimaryKeyObj());
            }

            if (employee != null) {
                session.delete(employee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employee != null) {
            clearCache(employee);
        }

        return employee;
    }

    @Override
    public Employee updateImpl(vn.com.ecopharma.hrm.model.Employee employee)
        throws SystemException {
        employee = toUnwrappedModel(employee);

        boolean isNew = employee.isNew();

        Session session = null;

        try {
            session = openSession();

            if (employee.isNew()) {
                session.save(employee);

                employee.setNew(false);
            } else {
                session.merge(employee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        return employee;
    }

    protected Employee toUnwrappedModel(Employee employee) {
        if (employee instanceof EmployeeImpl) {
            return employee;
        }

        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setNew(employee.isNew());
        employeeImpl.setPrimaryKey(employee.getPrimaryKey());

        employeeImpl.setEmployeeId(employee.getEmployeeId());
        employeeImpl.setGroupId(employee.getGroupId());
        employeeImpl.setCompanyId(employee.getCompanyId());
        employeeImpl.setUserId(employee.getUserId());
        employeeImpl.setUserName(employee.getUserName());
        employeeImpl.setCreateDate(employee.getCreateDate());
        employeeImpl.setModifiedDate(employee.getModifiedDate());
        employeeImpl.setEmp_code(employee.getEmp_code());
        employeeImpl.setFirstname(employee.getFirstname());
        employeeImpl.setMiddle_name(employee.getMiddle_name());
        employeeImpl.setLastname(employee.getLastname());
        employeeImpl.setEmail(employee.getEmail());
        employeeImpl.setContact_number(employee.getContact_number());
        employeeImpl.setNickname(employee.getNickname());
        employeeImpl.setBirthday(employee.getBirthday());
        employeeImpl.setGender(employee.getGender());
        employeeImpl.setMarital_status(employee.getMarital_status());
        employeeImpl.setStatus(employee.getStatus());
        employeeImpl.setJobtitleId(employee.getJobtitleId());
        employeeImpl.setJoined_date(employee.getJoined_date());
        employeeImpl.setSubUnitId(employee.getSubUnitId());

        return employeeImpl;
    }

    /**
     * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByPrimaryKey(primaryKey);

        if (employee == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employee;
    }

    /**
     * Returns the employee with the primary key or throws a {@link vn.com.ecopharma.hrm.NoSuchEmployeeException} if it could not be found.
     *
     * @param employeeId the primary key of the employee
     * @return the employee
     * @throws vn.com.ecopharma.hrm.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByPrimaryKey(long employeeId)
        throws NoSuchEmployeeException, SystemException {
        return findByPrimaryKey((Serializable) employeeId);
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Employee employee = (Employee) EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, primaryKey);

        if (employee == _nullEmployee) {
            return null;
        }

        if (employee == null) {
            Session session = null;

            try {
                session = openSession();

                employee = (Employee) session.get(EmployeeImpl.class, primaryKey);

                if (employee != null) {
                    cacheResult(employee);
                } else {
                    EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, primaryKey, _nullEmployee);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                    EmployeeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employee;
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employeeId the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPrimaryKey(long employeeId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employeeId);
    }

    /**
     * Returns all the employees.
     *
     * @return the employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the employees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @return the range of employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the employees.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.hrm.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of employees
     * @param end the upper bound of the range of employees (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEE;

                if (pagination) {
                    sql = sql.concat(EmployeeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employees from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Employee employee : findAll()) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees.
     *
     * @return the number of employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employee persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.vn.com.ecopharma.hrm.model.Employee")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Employee>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
