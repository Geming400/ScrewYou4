package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.FieldPathElement.class)
public class FieldPathElement124648511Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_933915667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933915667L))
            info.setReturnValue("q\u054B\uB9EA=9T\uA8F6Q_u}Y#");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get__28965218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28965218L))
            info.setReturnValue("M\u116Am}SzR9\u56A4MAvSB%?\u59C0rGOz= 2R\uA622:yYA>\u90CAK\uFF96Q`YH:X9PV\u5A90@h9#No");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__783977757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783977757L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_895072036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895072036L))
            info.setReturnValue("_zO=\u9F40$8`*\u4F54-F\uFC04Yc\u7621fe:\u1AB3\u513AR\uA665\u17C0+0rg7Y?Zd8r\u9BEENo:9}jHu[dqd\u4913\u560A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_682000602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682000602L))
            info.setReturnValue(130569942);
    }


}
