package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.Identifier.class)
public class Identifier605198529Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__303428235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303428235L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1375621558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1375621558L))
            info.setReturnValue("\u6162Z\u9D6B>hW=C\u44BE9zyUc)\u773C6.f2U3 L>tN\uA9AA1i\u9AAF;4Q\uA7D9+\u369DUU678v`X_E \u50292eE6\"|9-bjw7cS-i6)*\u21BC?\uA7282\u5769UR&Xh\uBB3B33Va");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1162550124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162550124L))
            info.setReturnValue(969279805);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/resources/Identifier;)I", cancellable = true)
    private void compareTo__2072055569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2072055569L))
            info.setReturnValue(-1712060736);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1286905405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286905405L))
            info.setReturnValue(283502367);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void parse__574539351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-574539351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString_1806440700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806440700L))
            info.setReturnValue("e):=7)66iz$c\uD116Jqdc\u727C)\u68BB\u5737sj7\u3A706NLd{d*+s/k&A\uD2E6\u2518t\u38F7A_r\u0809RttaUz!No\uD0C9\u7D04EroN64q}dpufa");
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void read_1346106464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346106464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void read_319266140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319266140L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath()Ljava/lang/String;", cancellable = true)
    private void getPath_2043637413(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043637413L))
            info.setReturnValue("as\u33E1W:@d\u1BC6$+^9\u3B0F\u04E0B?:#buzHVt\u59D8F?%W!@li@}0Ry:A)vJBZ\u363AbvG\u60ADmoZ[.a'h:tdt9^[#{88FefZ\uA13C8A;\u4503+ue&|$ ZA.{\u2DF1");
    }

    @Inject(at = @At("HEAD"), method = "withPrefix(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPrefix_1691250870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1691250870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSuffix(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withSuffix_1323202741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323202741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDefaultNamespace(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void withDefaultNamespace__315492938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315492938L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toLanguageKey__1711491092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711491092L))
            info.setReturnValue("l\u3F50yawZMv0%\uF9064R`__");
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey()Ljava/lang/String;", cancellable = true)
    private void toLanguageKey_1451033014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451033014L))
            info.setReturnValue("\uCC2E<|7k*@I\u7E9D/Rg/cNL|3L\u9244\u21DCCW4 ,^Y}gJ9V7oplX6{rj\"r#h`O9>$\uB38BV2/ 4)u\u7E14hyp&\u7461.-kg,Ym`c|t");
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toLanguageKey_522947746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(522947746L))
            info.setReturnValue("h!ki>^@lG6?mA';AQ5dj;fIMAt0 !dDl\u8BD3=1/m[\">|MJhgR\uB676\uA6CAb\u16639+GY \u3D7Dtu\uF90F\u1372]z\u4EA0\u0CF1<h\uA263'xO\u1E7Dj))DO9%\u9DC9\u461BdP");
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInIdentifier(C)Z", cancellable = true)
    private static void isAllowedInIdentifier__755012145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755012145L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validPathChar(C)Z", cancellable = true)
    private static void validPathChar_1582696154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1582696154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "bySeparator(Ljava/lang/String;C)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void bySeparator__1907070295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907070295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidPath(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPath__560778909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560778909L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tryBySeparator(Ljava/lang/String;C)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryBySeparator_144263236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144263236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidNamespace(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidNamespace_1464473809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1464473809L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readNonEmpty(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void readNonEmpty__918929472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918929472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveAgainst(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void resolveAgainst__997733483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997733483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortLanguageKey()Ljava/lang/String;", cancellable = true)
    private void toShortLanguageKey_1288099376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1288099376L))
            info.setReturnValue("M2\"],F-ib$Y!o9f$Q96ig=\uD1C8i/\u5C33FcKRiMADSjQunduv\u2B2C [Z6\u3A803Sx9=rR{F1Q03TU2\u38715@fb'c$&z=\u1687b*M\uC6F7-");
    }

    @Inject(at = @At("HEAD"), method = "toDebugFileName()Ljava/lang/String;", cancellable = true)
    private void toDebugFileName_36132329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(36132329L))
            info.setReturnValue(" hPgXim,!{XUiWP,>c");
    }

    @Inject(at = @At("HEAD"), method = "tryParse(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryParse__461855634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-461855634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryBuild(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryBuild__386953249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386953249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPath(Ljava/util/function/UnaryOperator;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPath__1991876320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991876320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPath(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPath__1022659063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022659063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromNamespaceAndPath(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void fromNamespaceAndPath__773593353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773593353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespace()Ljava/lang/String;", cancellable = true)
    private void getNamespace_1827988783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827988783L))
            info.setReturnValue(")\u519C?@RHy%aoi(oi=");
    }


}
