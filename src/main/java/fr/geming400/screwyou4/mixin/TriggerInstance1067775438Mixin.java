package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.AnyBlockInteractionTrigger.TriggerInstance.class)
public class TriggerInstance1067775438Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1841679599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1841679599L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__67684537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67684537L))
            info.setReturnValue("2m;uTZb>]9^/\u89B1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1106038180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1106038180L))
            info.setReturnValue(-1478572607);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1309173660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1309173660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1072165290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1072165290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "location()Ljava/util/Optional;", cancellable = true)
    private void location_1313236860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313236860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player_1313236860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313236860L))
            info.setReturnValue(null);
    }


}
