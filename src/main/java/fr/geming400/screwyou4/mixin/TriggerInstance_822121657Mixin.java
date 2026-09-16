package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ShotCrossbowTrigger.TriggerInstance.class)
public class TriggerInstance_822121657Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__86504612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-86504612L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1592545181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1592545181L))
            info.setReturnValue("9D'D\u4BE4?\u28F4.i2U*OC7J1(\uB2C4<<f\"',\uD331");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1379473747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1379473747L))
            info.setReturnValue(-1736276965);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void matches__2103662399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103662399L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item_23607417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23607417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__408531385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408531385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shotCrossbow(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/world/level/ItemLike;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void shotCrossbow__1777353296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777353296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shotCrossbow(Ljava/util/Optional;)Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void shotCrossbow_1127201258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127201258L))
            info.setReturnValue(null);
    }


}
