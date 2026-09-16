package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.ConditionalEffect.class)
public class ConditionalEffect550147993Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__358478275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-358478275L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1320571518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320571518L))
            info.setReturnValue("p7sGer0JbD8\uCAF1cpb 7|P\uD374VZ?u>qp/TU\u7B25g8KCFe\u1F70@\u6A7F=F=JV\u915E@l@\u6AE2P^<a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1107500084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107500084L))
            info.setReturnValue(-363970267);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/storage/loot/LootContext;)Z", cancellable = true)
    private void matches_1264217180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1264217180L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__468570778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-468570778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "effect()Ljava/lang/Object;", cancellable = true)
    private void effect_1595499525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595499525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_901796806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(901796806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "requirements()Ljava/util/Optional;", cancellable = true)
    private void requirements__406452777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406452777L))
            info.setReturnValue(null);
    }


}
