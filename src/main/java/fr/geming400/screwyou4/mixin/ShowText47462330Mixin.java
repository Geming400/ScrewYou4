package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.HoverEvent.ShowText.class)
public class ShowText47462330Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void value__1302565762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1302565762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__861163938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861163938L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_817885855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(817885855L))
            info.setReturnValue("f^D9U*\u5F7E5SUj\u8C84By5(tkcnyF*\",1\u6A5AgA>\u9CD1yyP!qscNx7Y\u55F1K*\uA322Tn-\u3D66TzW62OFt`\u745F J#Z\u8EE4lq_?SwI}qb`L\u0C13o");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_604814421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604814421L))
            info.setReturnValue(775293136);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/chat/HoverEvent$Action;", cancellable = true)
    private void action__1093136476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093136476L))
            info.setReturnValue(net.minecraft.network.chat.HoverEvent.Action.SHOW_ENTITY);
    }


}
