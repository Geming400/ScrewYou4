package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.UniformGenerator.class)
public class UniformGenerator341432925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1726945184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726945184L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__794027050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-794027050L))
            info.setReturnValue("g&yi24\u2358WORvHwx0\u8561_\u5198hD\u72F5]NhCJo]b `\uCC38Z>xR`_\u6B6B4{Zl*ubxX'TQ'!4pdzN{JTm6H;-QK<e\uC4B7'>\uB564d6v\u8F07=j3s$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_379695667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379695667L))
            info.setReturnValue(-942733151);
    }

    @Inject(at = @At("HEAD"), method = "min()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void min__1322224721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322224721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void max__1322224721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322224721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt__2035532510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035532510L))
            info.setReturnValue(41910970);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat__2035535393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035535393L))
            info.setReturnValue(9.244496E8F);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_1918063616(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1918063616L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "between(FF)Lnet/minecraft/world/level/storage/loot/providers/number/UniformGenerator;", cancellable = true)
    private static void between_1113386978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1113386978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2077286649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077286649L))
            info.setReturnValue(null);
    }


}
