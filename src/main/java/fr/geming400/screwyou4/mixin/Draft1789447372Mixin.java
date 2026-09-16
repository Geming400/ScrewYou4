package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.ChatComponent.Draft.class)
public class Draft1789447372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_880821104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(880821104L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1735096399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735096399L))
            info.setReturnValue("e\u4A684\u3266ib\u17071UWsJ*0&\u0286+N\u427BlHYe\uFE62t:`NjF2M(&Yj\u8725In*G\u3869\uAE49$2Z\u69E0\u9B98n0l.S3L0&<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1948167833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948167833L))
            info.setReturnValue(-644437727);
    }

    @Inject(at = @At("HEAD"), method = "text()Ljava/lang/String;", cancellable = true)
    private void text__474512958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-474512958L))
            info.setReturnValue("koIV:if0M;XCT\"fMfJ7'|\"Z.)=^+icgj`mr\uA978'\u532C'/L");
    }

    @Inject(at = @At("HEAD"), method = "chatMethod()Lnet/minecraft/client/gui/components/ChatComponent$ChatMethod;", cancellable = true)
    private void chatMethod_1108351558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108351558L))
            info.setReturnValue(net.minecraft.client.gui.components.ChatComponent.ChatMethod.MESSAGE);
    }


}
