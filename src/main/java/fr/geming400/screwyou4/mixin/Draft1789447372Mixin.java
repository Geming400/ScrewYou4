package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.Draft.class)
public class Draft1789447372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1120007665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120007665L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_653987397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653987397L))
            info.setReturnValue("` =)l\"lm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1827710114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827710114L))
            info.setReturnValue(980732054);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text_653986901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(653986901L))
            info.setReturnValue("4dlR[g>& e*kF&5䐒7蛼");
    }

    @Inject(at = @At("HEAD"), method = "chatMethod()Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;", cancellable = true)
    private void chatMethod_861677101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861677101L))
            info.setReturnValue(net.minecraft.client.gui.components.ChatComponent.ChatMethod.MESSAGE);
    }


}
