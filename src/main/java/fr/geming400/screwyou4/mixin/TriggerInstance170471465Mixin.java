package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ChangeDimensionTrigger.TriggerInstance.class)
public class TriggerInstance170471465Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__738154803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738154803L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_940894990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940894990L))
            info.setReturnValue("@\u4BE6AZ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_727823556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727823556L))
            info.setReturnValue(-391111064);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void matches_1226451661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1226451661L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "from()Ljava/util/Optional;", cancellable = true)
    private void from__1476863103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476863103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "to()Ljava/util/Optional;", cancellable = true)
    private void to_1077260114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077260114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1060181576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060181576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimensionTo(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimensionTo_315427137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315427137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimensionFrom(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimensionFrom_194402544(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(194402544L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimension()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimension__1933976258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933976258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "changedDimension(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void changedDimension_917868094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917868094L))
            info.setReturnValue(null);
    }


}
