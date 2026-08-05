package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Weapon.class)
public class Weapon_117371334Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1502883592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502883592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1018088642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1018088642L))
            info.setReturnValue("!rY혗T)밌r `jJ霿Yr9S{殢 G|-勥.@_:'b$o@,!/,geṇdx-?VnRu☹G Nk/zQK6;vkj☑沈@^?`Xt(dA6>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_155634075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155634075L))
            info.setReturnValue(-1237182483);
    }

    @Inject(at = @At("HEAD"), method = "itemDamagePerAttack()I", cancellable = true)
    private void itemDamagePerAttack_155633579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155633579L))
            info.setReturnValue(1660376808);
    }

    @Inject(at = @At("HEAD"), method = "disableBlockingForSeconds()F", cancellable = true)
    private void disableBlockingForSeconds_155630696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(155630696L))
            info.setReturnValue(4.986518E8F);
    }


}
