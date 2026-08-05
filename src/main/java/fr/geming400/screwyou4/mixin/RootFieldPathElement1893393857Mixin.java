package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ProblemReporter.RootFieldPathElement.class)
public class RootFieldPathElement1893393857Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_757933386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757933386L))
            info.setReturnValue("|:1,H*@C曥ˇ倭fR9'i}떚楇<}Q+,{jT&L#.Y*ꔾ䚢}Arr ⺮me*|Fe)͓mx峼V^ეwDJ@J'剥iY緪 {fF䑱iY");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_757933386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757933386L))
            info.setReturnValue("|:1,H*@C曥ˇ倭fR9'i}떚楇<}Q+,{jT&L#.Y*ꔾ䚢}Arr ⺮me*|Fe)͓mx峼V^ეwDJ@J'剥iY緪 {fF䑱iY");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1016061180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016061180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_757933882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757933882L))
            info.setReturnValue("xf湀ꘙ6/ꉐQm]IdEuoZ-no(Iⳳc$]y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1931656599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931656599L))
            info.setReturnValue(476333507);
    }


}
