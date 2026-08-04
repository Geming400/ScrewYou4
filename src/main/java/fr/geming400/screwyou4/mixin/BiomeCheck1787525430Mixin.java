package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.BiomeCheck.class)
public class BiomeCheck1787525430Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1121929607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121929607L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_652065455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652065455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1825788172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1825788172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1121801143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121801143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test__1531125557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1531125557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__771588142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771588142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredBiomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void requiredBiomes__887488822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887488822L))
            info.setReturnValue(null);
    }


}
