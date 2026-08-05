package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariant.PigSoundSet.class)
public class PigSoundSet1748797675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1160657362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160657362L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_613337700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613337700L))
            info.setReturnValue("8L烫퇱J`;1Z|{^HUoGo$iZਲ਼$nm삟'}szNvGk腫+(Y야a|^%균/Ey(Q_쒑l0\"b:&i1'錛휪uey{姯䪳+[H3[>euIQF9.p<OQ庑6g,u0ϑ ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1787060417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787060417L))
            info.setReturnValue(-964647493);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__997293849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997293849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__997293849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997293849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void eatSound__997293849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997293849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound__997293849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997293849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__997293849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997293849L))
            info.setReturnValue(null);
    }


}
