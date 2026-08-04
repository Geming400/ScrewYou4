package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.datafix.ExtraDataFixUtils.class)
public class ExtraDataFixUtils378117896Mixin {
        @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/datafixers/types/Type;Ljava/lang/Object;Lcom/mojang/serialization/DynamicOps;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void cast_904043615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(904043615L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "cast(Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/Typed;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void cast__2146161033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146161033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState(Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void blockState_338466803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338466803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState(Ljava/lang/String;Ljava/util/Map;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void blockState_1178952940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178952940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readAndSet(Lcom/mojang/datafixers/Typed;Lcom/mojang/datafixers/OpticFinder;Lcom/mojang/serialization/Dynamic;)Lcom/mojang/datafixers/Typed;", cancellable = true)
    private static void readAndSet_611564756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611564756L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixInlineBlockPos(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixInlineBlockPos__1662638057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662638057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "patchSubType(Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;Lcom/mojang/datafixers/types/Type;)Lcom/mojang/datafixers/types/Type;", cancellable = true)
    private static void patchSubType__2626549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2626549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chainAllFilters([Ljava/util/function/Function;)Ljava/util/function/Function;", cancellable = true)
    private static void chainAllFilters__1650373358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650373358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixStringField(Lcom/mojang/serialization/Dynamic;Ljava/lang/String;Ljava/util/function/UnaryOperator;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixStringField_625940738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(625940738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dyeColorIdToName(I)Ljava/lang/String;", cancellable = true)
    private static void dyeColorIdToName__1042751440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042751440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fixBlockPos(Lcom/mojang/serialization/Dynamic;)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void fixBlockPos__2009731521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2009731521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBlockPos(Lcom/mojang/serialization/Dynamic;III)Lcom/mojang/serialization/Dynamic;", cancellable = true)
    private static void createBlockPos__883328574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-883328574L))
            info.setReturnValue(null);
    }


}
