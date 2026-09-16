package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.DebugSubscription.Update.class)
public class Update_405459823Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/util/Optional;", cancellable = true)
    private void value__1637362803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637362803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__503166446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-503166446L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1175883347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1175883347L))
            info.setReturnValue("\u9316<D:Sv|B/\u90D1W\u1EB2l[l\u43B6F(1h_pJaDxuaFa\uD1EF&GvtQoF\uAE2F\u19F8WiUF4LE)\u25F4(,0h\uA082\"E?Cr8s@)xU!\u2BEF7Y\u3F5F\u4EE8qR_]s/:%eEt\uC4D7[{m+05abO>VvFp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_962811913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962811913L))
            info.setReturnValue(1140888049);
    }

    @Inject(at = @At("HEAD"), method = "subscription()Lnet/minecraft/util/debug/DebugSubscription;", cancellable = true)
    private void subscription__556865506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-556865506L))
            info.setReturnValue(null);
    }


}
