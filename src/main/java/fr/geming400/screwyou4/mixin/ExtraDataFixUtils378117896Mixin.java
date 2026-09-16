package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.ExtraDataFixUtils.class)
public class ExtraDataFixUtils378117896Mixin {
        @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/datafixers/types/Type;Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void cast_414925534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(414925534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/Typed;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void cast__1672186442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672186442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState(Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void blockState__1419600905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419600905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState(Ljava/lang/String;Ljava/util/Map;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void blockState_1779325032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779325032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixBlockPos(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixBlockPos__1340953605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340953605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chainAllFilters([Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void chainAllFilters__230862601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230862601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dyeColorIdToName(I)Ljava/lang/String;", cancellable = true)
    private static void dyeColorIdToName_492280092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492280092L))
            info.setReturnValue("\u5EC6Np$@&S39j\u7A36@{f\"Sr2f\u036Dn!G:8Ko=[y5CiO\u61BE:?\u059A!fbT:\"<\u305E>[");
    }

    @Inject(at = @At("HEAD"), method = "fixStringField(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;Ljava/util/function/UnaryOperator;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixStringField__2106268906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106268906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixInlineBlockPos(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixInlineBlockPos_1544309196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1544309196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockPos(Lcom/mojang/serialization/Dynamic;III)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createBlockPos_1428596287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1428596287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAndSet(Lcom/mojang/datafixers/Typed;Lcom/mojang/datafixers/OpticFinder;Lcom/mojang/serialization/Dynamic;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readAndSet__1907313421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1907313421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "patchSubType(Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void patchSubType_109562173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109562173L))
            info.setReturnValue(null);
    }


}
