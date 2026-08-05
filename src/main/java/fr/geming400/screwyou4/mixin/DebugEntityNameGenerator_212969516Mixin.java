package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.DebugEntityNameGenerator.class)
public class DebugEntityNameGenerator_212969516Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityName(Lnet/minecraft/world/entity/Entity;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName_1199332719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199332719L))
            info.setReturnValue(" \uA76C[lWt7M=S1\u94D9<\u9F8A&Q`q!{\u8F8A]gqw^8/j{qjqEbQZHPP>-*'o3tNo&a\u9EA1M\uC0D5\u4F98xaF8%F'=j d/GO`$,S=\u1367\uC541jgR\u497BV\u6A39\u0290");
    }

    @Inject(at = @At("HEAD"), method = "getEntityName(Ljava/util/UUID;)Ljava/lang/String;", cancellable = true)
    private static void getEntityName_917253980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(917253980L))
            info.setReturnValue("`1[F>\u77F3!\u5D301?b Ji>SS\u5CA2XXUiS_U[%!v`<w|-\uFF37vx\uAFB6\u92FEcsU\u3E3Bv^GV\uAD2F2*{}/$\u1569K");
    }


}
