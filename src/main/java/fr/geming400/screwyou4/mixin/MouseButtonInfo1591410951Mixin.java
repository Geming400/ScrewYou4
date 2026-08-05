package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.MouseButtonInfo.class)
public class MouseButtonInfo1591410951Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_1629673197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629673197L))
            info.setReturnValue(-770176607);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1318044086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318044086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_455950976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(455950976L))
            info.setReturnValue("#Q!:TRx&v=拋B-Kl];n뷾dS64썻A瑃Cx栠ꈎ댇熱蓆'.`[홦6nxiBO9P#D{h=55${;kꥒ3C&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1629673693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629673693L))
            info.setReturnValue(627231398);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input_1629673197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629673197L))
            info.setReturnValue(-765176207);
    }

    @Inject(at = @At("HEAD"), method = "button()I", cancellable = true)
    private void button_1629673197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629673197L))
            info.setReturnValue(-765176207);
    }


}
