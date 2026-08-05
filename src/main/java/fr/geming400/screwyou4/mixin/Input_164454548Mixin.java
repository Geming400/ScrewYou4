package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.Input.class)
public class Input_164454548Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__744171721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744171721L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_934878072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934878072L))
            info.setReturnValue("D\uCF9BK!\"mSY'%4#\u1EE0Go/Ctku\u9192S8Y*H\uD41E;Uh\u4E18wbl\uA764=\uD41AP\u25A6EB6T9a\"\u51E8\u9BAF7-[Qk`\u275ASu-Gf?E{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_721806638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721806638L))
            info.setReturnValue(1200313208);
    }

    @Inject(at = @At("HEAD"), method = "shift()Z", cancellable = true)
    private void shift_2045348616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045348616L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "left()Z", cancellable = true)
    private void left_1853407907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1853407907L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "right()Z", cancellable = true)
    private void right__1276205650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276205650L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "jump()Z", cancellable = true)
    private void jump_796585692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796585692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forward()Z", cancellable = true)
    private void forward__167258459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167258459L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "sprint()Z", cancellable = true)
    private void sprint__240667536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-240667536L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "backward()Z", cancellable = true)
    private void backward_1962778695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1962778695L))
            info.setReturnValue(false);
    }


}
