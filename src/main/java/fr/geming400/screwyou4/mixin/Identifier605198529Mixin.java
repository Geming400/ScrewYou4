package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.Identifier.class)
public class Identifier605198529Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1990710292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990710292L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_643460775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643460775L))
            info.setReturnValue(-1428562299);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lnet/minecraft/resources/Identifier;)I", cancellable = true)
    private void compareTo__889255121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889255121L))
            info.setReturnValue(602938413);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo_1990822915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990822915L))
            info.setReturnValue(-1979041723);
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void parse__813730634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toShortString()Ljava/lang/String;", cancellable = true)
    private void toShortString__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "read(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void read_590763958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590763958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private static void read_544173234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544173234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath()Ljava/lang/String;", cancellable = true)
    private void getPath__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "withPrefix(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPrefix__813730882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withSuffix(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withSuffix__813730882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespace()Ljava/lang/String;", cancellable = true)
    private void getNamespace__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "fromNamespaceAndPath(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void fromNamespaceAndPath__2051781908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051781908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidPath(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidPath_1757563770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757563770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withDefaultNamespace(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void withDefaultNamespace__813730634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryParse(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryParse__813730634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPath(Ljava/util/function/UnaryOperator;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPath_943346901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943346901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPath(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void withPath__813730882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-813730882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryBuild(Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryBuild__2051781908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051781908L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toDebugFileName()Ljava/lang/String;", cancellable = true)
    private void toDebugFileName__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "isAllowedInIdentifier(C)Z", cancellable = true)
    private static void isAllowedInIdentifier_1813578467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813578467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toShortLanguageKey()Ljava/lang/String;", cancellable = true)
    private void toShortLanguageKey__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "resolveAgainst(Ljava/nio/file/Path;)Ljava/nio/file/Path;", cancellable = true)
    private void resolveAgainst__1063630624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063630624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bySeparator(Ljava/lang/String;C)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void bySeparator_536566711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536566711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toLanguageKey__1452889802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452889802L))
            info.setReturnValue("xD{\uB9AE*\u09B9\uAE1C$f^B^RXzG|9A2;\uC1CA fKgt3V@\" \u77A1m+wmf^F{pcF3+6]f\u9651;U>T2\u6265\uA6D41@>[/A");
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey()Ljava/lang/String;", cancellable = true)
    private void toLanguageKey__530261942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-530261942L))
            info.setReturnValue("+]h:_H|qBIEcbxUby 'fFImWYw4#");
    }

    @Inject(at = @At("HEAD"), method = "toLanguageKey(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private void toLanguageKey_1817940352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817940352L))
            info.setReturnValue("4[N\uCD38{\u2203\u0B43VJ#]bDH&\uACC7V=|8+e\uACC3x]j+45E\"uvD*ZoZmHsJkudxw5[@l5\u3219uid*a>L\uCDB4a\u6C9E*OKSb\uFCCF#^R5.@bdK(Y8\u15BF^!!_");
    }

    @Inject(at = @At("HEAD"), method = "validPathChar(C)Z", cancellable = true)
    private static void validPathChar_1813578467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813578467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readNonEmpty(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void readNonEmpty_590763958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590763958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidNamespace(Ljava/lang/String;)Z", cancellable = true)
    private static void isValidNamespace_1757563770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757563770L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tryBySeparator(Ljava/lang/String;C)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void tryBySeparator_536566711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536566711L))
            info.setReturnValue(null);
    }


}
