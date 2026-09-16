package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.GsonHelper.class)
public class GsonHelper107570079Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void parse__849940949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849940949L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void parse_839489317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839489317L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getType(Lcom/google/gson/JsonElement;)Ljava/lang/String;", cancellable = true)
    private static void getType_1953666225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1953666225L))
            info.setReturnValue("017\u5C8A@[JZ\uADBBoZ\u6800N3'");
    }

    @Inject(at = @At("HEAD"), method = "parseArray(Ljava/io/Reader;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void parseArray_325488080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325488080L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "parseArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void parseArray__714066230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714066230L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "getAsBoolean(Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z", cancellable = true)
    private static void getAsBoolean_525236674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525236674L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAsBoolean(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void getAsBoolean_1228035492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1228035492L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getAsString__1167462781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167462781L))
            info.setReturnValue("\u27E4\u8EB4GV{Os5\"ll|#\u35E3mfs0I J2\u3CD8h\uCA6CU\uB353A\u5632f\u0F90VH7be\u8098g9qrw'/\uF939b\u77E6p^Oz_/\u997F$\u0DEAET)b1CY.4\"UAVY%UN]Q%0]- X<I\uA5C4U]^\u4642Y\u0F1C[p}\u801C");
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getAsString__1073351431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1073351431L))
            info.setReturnValue(":Z3\u1F53_G\u5C50l4'oj),\u9978}ul\uA504<a{k&ksj(\u4A0E>Q+kx5\uA21Ee\u85F0]i\u945FglMu\uD7DF\uD13Dr#m&z\u9C5D.)=LTp#:yxGytV/\u3A08\uB627\u93B5m7gF]Z5:XS");
    }

    @Inject(at = @At("HEAD"), method = "getAsDouble(Lcom/google/gson/JsonObject;Ljava/lang/String;)D", cancellable = true)
    private static void getAsDouble__1185125579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185125579L))
            info.setReturnValue(6.939440041728798E7D);
    }

    @Inject(at = @At("HEAD"), method = "getAsDouble(Lcom/google/gson/JsonObject;Ljava/lang/String;D)D", cancellable = true)
    private static void getAsDouble__1287995697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1287995697L))
            info.setReturnValue(6.939440085131127E7D);
    }

    @Inject(at = @At("HEAD"), method = "getAsInt(Lcom/google/gson/JsonObject;Ljava/lang/String;)I", cancellable = true)
    private static void getAsInt_1324314284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324314284L))
            info.setReturnValue(-2055025110);
    }

    @Inject(at = @At("HEAD"), method = "getAsInt(Lcom/google/gson/JsonObject;Ljava/lang/String;I)I", cancellable = true)
    private static void getAsInt__800297817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800297817L))
            info.setReturnValue(353137956);
    }

    @Inject(at = @At("HEAD"), method = "getAsLong(Lcom/google/gson/JsonObject;Ljava/lang/String;)J", cancellable = true)
    private static void getAsLong__615947472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-615947472L))
            info.setReturnValue(-606379533668474105L);
    }

    @Inject(at = @At("HEAD"), method = "getAsLong(Lcom/google/gson/JsonObject;Ljava/lang/String;J)J", cancellable = true)
    private static void getAsLong__817975418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-817975418L))
            info.setReturnValue(-1942894675214209455L);
    }

    @Inject(at = @At("HEAD"), method = "getAsFloat(Lcom/google/gson/JsonObject;Ljava/lang/String;F)F", cancellable = true)
    private static void getAsFloat__270275890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270275890L))
            info.setReturnValue(6.93944E7F);
    }

    @Inject(at = @At("HEAD"), method = "getAsFloat(Lcom/google/gson/JsonObject;Ljava/lang/String;)F", cancellable = true)
    private static void getAsFloat_787309020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787309020L))
            info.setReturnValue(6.93944E7F);
    }

    @Inject(at = @At("HEAD"), method = "getAsByte(Lcom/google/gson/JsonObject;Ljava/lang/String;B)B", cancellable = true)
    private static void getAsByte__500596222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-500596222L))
            info.setReturnValue(-80);
    }

    @Inject(at = @At("HEAD"), method = "getAsByte(Lcom/google/gson/JsonObject;Ljava/lang/String;)B", cancellable = true)
    private static void getAsByte_918542108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(918542108L))
            info.setReturnValue(60);
    }

    @Inject(at = @At("HEAD"), method = "getAsShort(Lcom/google/gson/JsonObject;Ljava/lang/String;)S", cancellable = true)
    private static void getAsShort__96191351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96191351L))
            info.setReturnValue((short) 9152);
    }

    @Inject(at = @At("HEAD"), method = "getAsShort(Lcom/google/gson/JsonObject;Ljava/lang/String;S)S", cancellable = true)
    private static void getAsShort__1877352632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877352632L))
            info.setReturnValue((short) 18890);
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonObject(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getAsJsonObject__356194597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-356194597L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getAsJsonObject__2019790673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2019790673L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonArray(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonArray;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void getAsJsonArray_87141723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87141723L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonArray(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void getAsJsonArray__340810701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340810701L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "getAsBigDecimal(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/math/BigDecimal;", cancellable = true)
    private static void getAsBigDecimal__1692384227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692384227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigDecimal(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", cancellable = true)
    private static void getAsBigDecimal__1333097639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1333097639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsCharacter(Lcom/google/gson/JsonObject;Ljava/lang/String;C)C", cancellable = true)
    private static void getAsCharacter__368494251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-368494251L))
            info.setReturnValue((char) 53847);
    }

    @Inject(at = @At("HEAD"), method = "getAsCharacter(Lcom/google/gson/JsonObject;Ljava/lang/String;)C", cancellable = true)
    private static void getAsCharacter__47056724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47056724L))
            info.setReturnValue((char) 25946);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigInteger(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/math/BigInteger;)Ljava/math/BigInteger;", cancellable = true)
    private static void getAsBigInteger__186739930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186739930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigInteger(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/math/BigInteger;", cancellable = true)
    private static void getAsBigInteger__2022130691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022130691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToJsonArray(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void convertToJsonArray__470033486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-470033486L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "toStableString(Lcom/google/gson/JsonElement;)Ljava/lang/String;", cancellable = true)
    private static void toStableString_1492335034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492335034L))
            info.setReturnValue("\uACA3(%?]|U\u706Fs9fK/>J\uA007,\u8787@E0wOE_3N$\u5F91v%65obE\uB2F22$@Kt\u8E4B]s<kh(\uD553rQ\uAD33FHvIG!2P[Lv6bO;}3fC g?L;O\u4209R");
    }

    @Inject(at = @At("HEAD"), method = "convertToBoolean(Lcom/google/gson/JsonElement;Ljava/lang/String;)Z", cancellable = true)
    private static void convertToBoolean_69218289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69218289L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertToDouble(Lcom/google/gson/JsonElement;Ljava/lang/String;)D", cancellable = true)
    private static void convertToDouble__1176649440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176649440L))
            info.setReturnValue(6.939440048526156E7D);
    }

    @Inject(at = @At("HEAD"), method = "convertToCharacter(Lcom/google/gson/JsonElement;Ljava/lang/String;)C", cancellable = true)
    private static void convertToCharacter_1986772379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986772379L))
            info.setReturnValue((char) 36248);
    }

    @Inject(at = @At("HEAD"), method = "convertToBigInteger(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/math/BigInteger;", cancellable = true)
    private static void convertToBigInteger_792990968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792990968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToObject(Lcom/google/gson/JsonElement;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void convertToObject__2006198176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006198176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isArrayNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isArrayNode_1929453811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1929453811L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAsObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Object;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void getAsObject__1719971083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719971083L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getAsObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void getAsObject__1556605927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556605927L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "convertToByte(Lcom/google/gson/JsonElement;Ljava/lang/String;)B", cancellable = true)
    private static void convertToByte__65276715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65276715L))
            info.setReturnValue(-81);
    }

    @Inject(at = @At("HEAD"), method = "fromNullableJson(Lcom/google/gson/Gson;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromNullableJson__2134985813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134985813L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromNullableJson(Lcom/google/gson/Gson;Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromNullableJson__81382927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81382927L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "convertToBigDecimal(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/math/BigDecimal;", cancellable = true)
    private static void convertToBigDecimal_238227794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238227794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToInt(Lcom/google/gson/JsonElement;Ljava/lang/String;)I", cancellable = true)
    private static void convertToInt_165752679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165752679L))
            info.setReturnValue(1746130069);
    }

    @Inject(at = @At("HEAD"), method = "convertToJsonObject(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void convertToJsonObject_1602373604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602373604L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "convertToString(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void convertToString_417385336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417385336L))
            info.setReturnValue("$B>QAMcd;7eF^4o!&8wFE\uAFEDe=D=Xkz;15*z2..U[0|Z_*@\"24%0Uo_\u21E2&);O\u996E0LE\u77CEm5\uB140\"PNH&M_3\uB74E]`i\u3892U%HA]cfc#BOQb7m");
    }

    @Inject(at = @At("HEAD"), method = "convertToLong(Lcom/google/gson/JsonElement;Ljava/lang/String;)J", cancellable = true)
    private static void convertToLong__390044079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-390044079L))
            info.setReturnValue(-3198880130500153392L);
    }

    @Inject(at = @At("HEAD"), method = "isObjectNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isObjectNode_1218527737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218527737L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToFloat(Lcom/google/gson/JsonElement;Ljava/lang/String;)F", cancellable = true)
    private static void convertToFloat_688154001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(688154001L))
            info.setReturnValue(7.04034E7F);
    }

    @Inject(at = @At("HEAD"), method = "convertToShort(Lcom/google/gson/JsonElement;Ljava/lang/String;)S", cancellable = true)
    private static void convertToShort__930928514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930928514L))
            info.setReturnValue((short) 4587);
    }

    @Inject(at = @At("HEAD"), method = "isStringValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isStringValue__151007037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151007037L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStringValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isStringValue__421655954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421655954L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToItem(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void convertToItem_1566436157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566436157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBooleanValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isBooleanValue_643057457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643057457L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBooleanValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isBooleanValue__1651979872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1651979872L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isValidNode__1696913424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1696913424L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNumberValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isNumberValue__748378485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748378485L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNumberValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isNumberValue__770277978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770277978L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "encodesLongerThan(Lcom/google/gson/JsonElement;I)Z", cancellable = true)
    private static void encodesLongerThan_1048217409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048217409L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidPrimitive(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPrimitive__1495156657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495156657L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAsItem(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAsItem_1178421198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178421198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsItem(Lcom/google/gson/JsonObject;Ljava/lang/String;Lnet/minecraft/core/Holder;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAsItem_719871879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719871879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNonNull(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getNonNull__1293105061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293105061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson_2131679781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131679781L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson_1799502610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1799502610L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson__1854283233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854283233L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "writeValue(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;Ljava/util/Comparator;)V", cancellable = true)
    private static void writeValue_605171399(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(605171399L))
            info.cancel();
    }


}
