package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DeathProtection.class)
public class DeathProtection1537334543Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1372120494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1372120494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_401874568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(401874568L))
            info.setReturnValue("w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1575597285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575597285L))
            info.setReturnValue(46944854);
    }

    @Inject(at = @At("HEAD"), method = "deathEffects()Ljava/util/List;", cancellable = true)
    private void deathEffects__1131295937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131295937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void applyEffects_640166381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640166381L))
            info.cancel();
    }


}
