package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ConditionalEffect.class)
public class ConditionalEffect550147993Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1935660252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935660252L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__585311982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585311982L))
            info.setReturnValue("\u051B)7d'>C[\uCDD70Zo$\u6A9Al\u382F8");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_588410735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(588410735L))
            info.setReturnValue(639763972);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches__1826801105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826801105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate_2126778684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2126778684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1033825968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033825968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/lang/Object;", cancellable = true)
    private void effect__1885627084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1885627084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/Optional;", cancellable = true)
    private void requirements_795609415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795609415L))
            info.setReturnValue(null);
    }


}
