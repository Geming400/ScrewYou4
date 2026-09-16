package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.DeathProtection.class)
public class DeathProtection1537334543Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_628708275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628708275L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1987209228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987209228L))
            info.setReturnValue("a&\u286E\u13EFzs-+n]f;b\u1D83|kg\u0941*<m\u1C53\u831C\uA70DI^S,daQ>9\u6AB0v?>Aq9W_JO");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2094686634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2094686634L))
            info.setReturnValue(-1870965024);
    }

    @Inject(at = @At("HEAD"), method = "applyEffects(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/entity/LivingEntity;)V", cancellable = true)
    private void applyEffects__2093516127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093516127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deathEffects()Ljava/util/List;", cancellable = true)
    private void deathEffects__1818813395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818813395L))
            info.setReturnValue(null);
    }


}
