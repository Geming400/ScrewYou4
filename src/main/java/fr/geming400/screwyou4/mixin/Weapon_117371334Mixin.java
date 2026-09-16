package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Weapon.class)
public class Weapon_117371334Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__791254935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-791254935L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_887794858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887794858L))
            info.setReturnValue("%pU\uC24D;{\uD05B\u3267tg(y!^&/\u2386&\uA5C8LFAF8c2gv$:Kx\u36C1!E1<y\uA84F{uHLJ),J!8\u7A07f<\u9EB7\u572F\uD4CF|x\"^X|v\u3073ao1F4\u29B0II\uA967X,H+jVG>+U|>=2{]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_674723424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674723424L))
            info.setReturnValue(839733976);
    }

    @Inject(at = @At("HEAD"), method = "disableBlockingForSeconds()F", cancellable = true)
    private void disableBlockingForSeconds__1116155979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1116155979L))
            info.setReturnValue(1.701893E8F);
    }

    @Inject(at = @At("HEAD"), method = "itemDamagePerAttack()I", cancellable = true)
    private void itemDamagePerAttack__1292424696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292424696L))
            info.setReturnValue(-943790456);
    }


}
