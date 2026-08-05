package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.SuppressedExceptionCollector.class)
public class SuppressedExceptionCollector576325686Mixin {
        @Inject(at = @At("HEAD"), method = "addEntry(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private void addEntry__1355730629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1355730629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dump()Ljava/lang/String;", cancellable = true)
    private void dump__1006578029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006578029L))
            info.setReturnValue("/\u8D77: u}iq\u2BC7&=,tLB\u18A1/:XPP<D\u26B9$FvM\u13576$=tq{>\u82C28>\u71E2|}JI\uC58C\u4537k0,\u29E6L]J{Wa0wo\u6D294q\uD10D>}MesL_+\uB871_Jh['{$Tg q");
    }


}
