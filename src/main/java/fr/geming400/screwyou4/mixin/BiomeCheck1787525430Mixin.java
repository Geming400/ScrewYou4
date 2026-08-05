package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.BiomeCheck.class)
public class BiomeCheck1787525430Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_878899162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878899162L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1737018341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737018341L))
            info.setReturnValue("D\uD778)5Gu(F$dOI\u8259ZbWGFS;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1950089775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1950089775L))
            info.setReturnValue(-645081435);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_50553719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50553719L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/world/entity/variant/SpawnContext;)Z", cancellable = true)
    private void test__1724857379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724857379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "requiredBiomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void requiredBiomes__703415652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-703415652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1440996612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1440996612L))
            info.setReturnValue(null);
    }


}
