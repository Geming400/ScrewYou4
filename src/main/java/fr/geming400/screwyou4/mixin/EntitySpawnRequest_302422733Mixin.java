package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.EntitySpawnRequest.class)
public class EntitySpawnRequest_302422733Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1687934991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687934991L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__833037243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-833037243L))
            info.setReturnValue("M|D0b2ZsH1ghwgERᑽ&7@LmjKOຏ@Se<v=X\"vywELT!hg@NK&Sjf宨&A_괙]<钵鋬ꚡ,W5)2YH1n]=蕮Q1ᡵ,8/02-A:@MfG+$␟");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_340685474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340685474L))
            info.setReturnValue(33532027);
    }

    @Inject(at = @At("HEAD"), method = "reason()Lnet/minecraft/world/entity/EntitySpawnReason;", cancellable = true)
    private void reason__772841671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772841671L))
            info.setReturnValue(net.minecraft.world.entity.EntitySpawnReason.DISPENSER);
    }

    @Inject(at = @At("HEAD"), method = "ignoreChecks()Z", cancellable = true)
    private void ignoreChecks_340701315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340701315L))
            info.setReturnValue(false);
    }


}
