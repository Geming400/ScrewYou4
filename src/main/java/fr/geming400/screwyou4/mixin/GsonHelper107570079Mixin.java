package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.GsonHelper.class)
public class GsonHelper107570079Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void parse__1313634760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313634760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/io/Reader;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void parse__1797861774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797861774L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getType(Lcom/google/gson/JsonElement;)Ljava/lang/String;", cancellable = true)
    private static void getType__1707357599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707357599L))
            info.setReturnValue("&G(c..#_&dlK5\u8103f\u16EBnHCo9;v\u5BE9`v2*\uBE11n5CN})_gm\u1DB8\u053EA@G ");
    }

    @Inject(at = @At("HEAD"), method = "parseArray(Ljava/io/Reader;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void parseArray__644542986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-644542986L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "parseArray(Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void parseArray__906017424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906017424L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBoolean(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void getAsBoolean_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAsBoolean(Lcom/google/gson/JsonObject;Ljava/lang/String;Z)Z", cancellable = true)
    private static void getAsBoolean__585466654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585466654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getAsString_281791840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281791840L))
            info.setReturnValue("N_9[}Ehl3Fy`n1|9p<z\u8773RvMR]o\u522Eee%F<");
    }

    @Inject(at = @At("HEAD"), method = "getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void getAsString_542106282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(542106282L))
            info.setReturnValue("5@><lw$\u1B42lRG\u645CZTd\u23CB.cChCoIIV^XjbI\u9AA1;OTEAC\u4D3B`\u6620\"I\u0C6BQ`]1],g,PH4i\uCF51>z\uD64F");
    }

    @Inject(at = @At("HEAD"), method = "getAsDouble(Lcom/google/gson/JsonObject;Ljava/lang/String;)D", cancellable = true)
    private static void getAsDouble_776543214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776543214L))
            info.setReturnValue(4.017481000904679E8D);
    }

    @Inject(at = @At("HEAD"), method = "getAsDouble(Lcom/google/gson/JsonObject;Ljava/lang/String;D)D", cancellable = true)
    private static void getAsDouble__605805258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605805258L))
            info.setReturnValue(4.017481006728214E8D);
    }

    @Inject(at = @At("HEAD"), method = "getAsInt(Lcom/google/gson/JsonObject;Ljava/lang/String;I)I", cancellable = true)
    private static void getAsInt__601182848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601182848L))
            info.setReturnValue(-1272312923);
    }

    @Inject(at = @At("HEAD"), method = "getAsInt(Lcom/google/gson/JsonObject;Ljava/lang/String;)I", cancellable = true)
    private static void getAsInt_776548019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776548019L))
            info.setReturnValue(-99988935);
    }

    @Inject(at = @At("HEAD"), method = "getAsLong(Lcom/google/gson/JsonObject;Ljava/lang/String;J)J", cancellable = true)
    private static void getAsLong__600258366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600258366L))
            info.setReturnValue(2413825619987973419L);
    }

    @Inject(at = @At("HEAD"), method = "getAsLong(Lcom/google/gson/JsonObject;Ljava/lang/String;)J", cancellable = true)
    private static void getAsLong_776548980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776548980L))
            info.setReturnValue(2595947180602298462L);
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson_132710417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(132710417L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson__1570032380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570032380L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromJson(Lcom/google/gson/Gson;Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void fromJson_909167767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(909167767L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "writeValue(Lcom/google/gson/stream/JsonWriter;Lcom/google/gson/JsonElement;Ljava/util/Comparator;)V", cancellable = true)
    private static void writeValue__315068711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-315068711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAsItem(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAsItem__2069636791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069636791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsItem(Lcom/google/gson/JsonObject;Ljava/lang/String;Lnet/minecraft/core/Holder;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getAsItem_912111916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912111916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNonNull(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonElement;", cancellable = true)
    private static void getNonNull_1922514393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1922514393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToBoolean(Lcom/google/gson/JsonElement;Ljava/lang/String;)Z", cancellable = true)
    private static void convertToBoolean_1671280695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671280695L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toStableString(Lcom/google/gson/JsonElement;)Ljava/lang/String;", cancellable = true)
    private static void toStableString__1707357599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707357599L))
            info.setReturnValue("&G(c..#_&dlK5\u8103f\u16EBnHCo9;v\u5BE9`v2*\uBE11n5CN})_gm\u1DB8\u053EA@G ");
    }

    @Inject(at = @At("HEAD"), method = "convertToJsonObject(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void convertToJsonObject__1570262791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570262791L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "isArrayNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isArrayNode_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToByte(Lcom/google/gson/JsonElement;Ljava/lang/String;)B", cancellable = true)
    private static void convertToByte_1671257631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671257631L))
            info.setReturnValue(-88);
    }

    @Inject(at = @At("HEAD"), method = "convertToObject(Lcom/google/gson/JsonElement;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void convertToObject_801528627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(801528627L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "encodesLongerThan(Lcom/google/gson/JsonElement;I)Z", cancellable = true)
    private static void encodesLongerThan__1850531064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850531064L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertToCharacter(Lcom/google/gson/JsonElement;Ljava/lang/String;)C", cancellable = true)
    private static void convertToCharacter_1671258592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671258592L))
            info.setReturnValue((char) 26331);
    }

    @Inject(at = @At("HEAD"), method = "convertToString(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void convertToString__923282089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-923282089L))
            info.setReturnValue("\uFCCC4>y$s\u2AFDIl\u91565");
    }

    @Inject(at = @At("HEAD"), method = "getAsObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void getAsObject__749232448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-749232448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/lang/Object;Lcom/google/gson/JsonDeserializationContext;Ljava/lang/Class;)Ljava/lang/Object;", cancellable = true)
    private static void getAsObject__1565384228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1565384228L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "isObjectNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isObjectNode_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToJsonArray(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void convertToJsonArray_1856650895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856650895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStringValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isStringValue_43525613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43525613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isStringValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isStringValue_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidPrimitive(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPrimitive_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToDouble(Lcom/google/gson/JsonElement;Ljava/lang/String;)D", cancellable = true)
    private static void convertToDouble_1671259553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671259553L))
            info.setReturnValue(4.069464008225411E8D);
    }

    @Inject(at = @At("HEAD"), method = "convertToInt(Lcom/google/gson/JsonElement;Ljava/lang/String;)I", cancellable = true)
    private static void convertToInt_1671264358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671264358L))
            info.setReturnValue(-2065073182);
    }

    @Inject(at = @At("HEAD"), method = "convertToBigDecimal(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/math/BigDecimal;", cancellable = true)
    private static void convertToBigDecimal__1874266415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1874266415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNumberValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isNumberValue_43525613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43525613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNumberValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isNumberValue_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToShort(Lcom/google/gson/JsonElement;Ljava/lang/String;)S", cancellable = true)
    private static void convertToShort_1671273968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671273968L))
            info.setReturnValue((short) 32533);
    }

    @Inject(at = @At("HEAD"), method = "isValidNode(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isValidNode_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "convertToItem(Lcom/google/gson/JsonElement;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void convertToItem_711825724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(711825724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertToFloat(Lcom/google/gson/JsonElement;Ljava/lang/String;)F", cancellable = true)
    private static void convertToFloat_1671261475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671261475L))
            info.setReturnValue(4.069464E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromNullableJson(Lcom/google/gson/Gson;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromNullableJson_1791966718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1791966718L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "fromNullableJson(Lcom/google/gson/Gson;Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;", cancellable = true)
    private static void fromNullableJson__1570032380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1570032380L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "convertToBigInteger(Lcom/google/gson/JsonElement;Ljava/lang/String;)Ljava/math/BigInteger;", cancellable = true)
    private static void convertToBigInteger__1803999804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803999804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBooleanValue(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", cancellable = true)
    private static void isBooleanValue_776564356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776564356L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBooleanValue(Lcom/google/gson/JsonElement;)Z", cancellable = true)
    private static void isBooleanValue_43525613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(43525613L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "convertToLong(Lcom/google/gson/JsonElement;Ljava/lang/String;)J", cancellable = true)
    private static void convertToLong_1671265319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671265319L))
            info.setReturnValue(6241463747137314285L);
    }

    @Inject(at = @At("HEAD"), method = "getAsFloat(Lcom/google/gson/JsonObject;Ljava/lang/String;F)F", cancellable = true)
    private static void getAsFloat__603956294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-603956294L))
            info.setReturnValue(4.069464E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAsFloat(Lcom/google/gson/JsonObject;Ljava/lang/String;)F", cancellable = true)
    private static void getAsFloat_776545136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776545136L))
            info.setReturnValue(4.069464E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAsShort(Lcom/google/gson/JsonObject;Ljava/lang/String;S)S", cancellable = true)
    private static void getAsShort__591938028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-591938028L))
            info.setReturnValue((short) 212);
    }

    @Inject(at = @At("HEAD"), method = "getAsShort(Lcom/google/gson/JsonObject;Ljava/lang/String;)S", cancellable = true)
    private static void getAsShort_776557629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776557629L))
            info.setReturnValue((short) 26862);
    }

    @Inject(at = @At("HEAD"), method = "getAsByte(Lcom/google/gson/JsonObject;Ljava/lang/String;B)B", cancellable = true)
    private static void getAsByte__607654222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607654222L))
            info.setReturnValue(-33);
    }

    @Inject(at = @At("HEAD"), method = "getAsByte(Lcom/google/gson/JsonObject;Ljava/lang/String;)B", cancellable = true)
    private static void getAsByte_776541292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776541292L))
            info.setReturnValue(-123);
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonObject(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getAsJsonObject__1896254836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896254836L))
            info.setReturnValue(new com.google.gson.JsonObject());
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonObject(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonObject;)Lcom/google/gson/JsonObject;", cancellable = true)
    private static void getAsJsonObject__2027980576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027980576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigDecimal(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", cancellable = true)
    private static void getAsBigDecimal__1952728416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952728416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigDecimal(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/math/BigDecimal;", cancellable = true)
    private static void getAsBigDecimal_929309348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929309348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonArray(Lcom/google/gson/JsonObject;Ljava/lang/String;Lcom/google/gson/JsonArray;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void getAsJsonArray_805607762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(805607762L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "getAsJsonArray(Lcom/google/gson/JsonObject;Ljava/lang/String;)Lcom/google/gson/JsonArray;", cancellable = true)
    private static void getAsJsonArray__924811620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924811620L))
            info.setReturnValue(new com.google.gson.JsonArray());
    }

    @Inject(at = @At("HEAD"), method = "getAsBigInteger(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/math/BigInteger;", cancellable = true)
    private static void getAsBigInteger_999575959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(999575959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsBigInteger(Lcom/google/gson/JsonObject;Ljava/lang/String;Ljava/math/BigInteger;)Ljava/math/BigInteger;", cancellable = true)
    private static void getAsBigInteger_1388484928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1388484928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAsCharacter(Lcom/google/gson/JsonObject;Ljava/lang/String;)C", cancellable = true)
    private static void getAsCharacter_776542253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776542253L))
            info.setReturnValue((char) 19404);
    }

    @Inject(at = @At("HEAD"), method = "getAsCharacter(Lcom/google/gson/JsonObject;Ljava/lang/String;C)C", cancellable = true)
    private static void getAsCharacter__606729740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606729740L))
            info.setReturnValue((char) 64338);
    }


}
