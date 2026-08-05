package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.MultipliedFloats.class)
public class MultipliedFloats_216831870Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_987254898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987254898L))
            info.setReturnValue(" w|@!j$1}u{$>vWu\"csg\u8964;qy)Aa^ZC:Ik.?*r%@CV\u905C6_ufV`v\u49D4h\u11EF)#I\u142AC\u6548 \u719ApC339z*k1");
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__816232982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816232982L))
            info.setReturnValue(9.054917E8F);
    }


}
