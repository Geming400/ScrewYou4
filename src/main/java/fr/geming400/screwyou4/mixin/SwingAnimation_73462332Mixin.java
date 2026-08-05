package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.SwingAnimation.class)
public class SwingAnimation_73462332Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/item/SwingAnimationType;", cancellable = true)
    private void type__737711052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737711052L))
            info.setReturnValue(net.minecraft.world.item.SwingAnimationType.STAB);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1458974590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458974590L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1061997644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061997644L))
            info.setReturnValue("zAnzkt:|\"}]Cf?Ud>t(vU砨!f劑%%#hdpt6F[茀S0N@NpNr粫3W犭^l%l[⻥*z6>]]6pBt=H!' }N^$(xM");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_111725073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111725073L))
            info.setReturnValue(-1404360870);
    }

    @Inject(at = @At("HEAD"), method = "duration()I", cancellable = true)
    private void duration_111724577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111724577L))
            info.setReturnValue(-1225837381);
    }


}
