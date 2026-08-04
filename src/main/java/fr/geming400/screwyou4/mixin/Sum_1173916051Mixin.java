package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.Sum.class)
public class Sum_1173916051Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1735538987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735538987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_38456075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38456075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1212178792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212178792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt__1203049385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203049385L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__1203052268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203052268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__1544420555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1544420555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sum([Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;)Lnet/minecraft/world/level/storage/loot/providers/number/Sum;", cancellable = true)
    private static void sum_1241968035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241968035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "summands()Ljava/util/List;", cancellable = true)
    private void summands__1494714430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494714430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1385197522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1385197522L))
            info.setReturnValue(null);
    }


}
