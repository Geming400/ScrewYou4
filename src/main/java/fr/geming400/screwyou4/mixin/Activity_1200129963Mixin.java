package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.schedule.Activity.class)
public class Activity_1200129963Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__688716940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-688716940L))
            info.setReturnValue(":-HH_C\u31B0\u1B82Jgt]\u4F83d\u42BF.\uAFFFkOe?xRR0ijDkE_{0\"W},2!X*ao_IE5u-Qs\"#{'zbG`4DHP$iJnWP|K#KCS\u42358(w\u022F\u922EON$-");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_291503198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291503198L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1970552991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1970552991L))
            info.setReturnValue("VP\u5E46rFtc*q\uBAB6X@r&YXD}#pT(f]nX]x.a:*&A\"UWniR8!1)OGXs/4\uD7DFcyK{-:mB\u61478&$3\uA517,>2\u2E026N\u6B05D=1Y/Tl}*3lEA##;Y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1757481557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757481557L))
            info.setReturnValue(-1137881637);
    }


}
