package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.StructureCheck.class)
public class StructureCheck_446083581Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1831595839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831595839L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__689376395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689376395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_484346322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484346322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1831724303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831724303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test_1422399889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1422399889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2113029992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113029992L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requiredStructures()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void requiredStructures_2066036624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066036624L))
            info.setReturnValue(null);
    }


}
