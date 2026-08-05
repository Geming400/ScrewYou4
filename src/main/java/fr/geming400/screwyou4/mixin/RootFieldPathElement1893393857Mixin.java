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
            info.setReturnValue("|:1,H*@C\u66E5\u02C7\u502DfR9'i}\uB59A\u6947<}Q+,{jT&L#.Y*\uA53E\u46A2}Arr \u2EAEme*|Fe)\u0353mx\u5CFCV^\u10D4wDJ@J'\u5265iY\u7DEA {fF\u4471iY");
    }

    @Inject(at = @At("HEAD"), method = "get()Ljava/lang/String;", cancellable = true)
    private void get_757933386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757933386L))
            info.setReturnValue("|:1,H*@C\u66E5\u02C7\u502DfR9'i}\uB59A\u6947<}Q+,{jT&L#.Y*\uA53E\u46A2}Arr \u2EAEme*|Fe)\u0353mx\u5CFCV^\u10D4wDJ@J'\u5265iY\u7DEA {fF\u4471iY");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1016061180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016061180L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_757933882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(757933882L))
            info.setReturnValue("xf\u6E40\uA6196/\uA250Qm]IdEuoZ-no(I\u2CF3c$]y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1931656599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1931656599L))
            info.setReturnValue(510637907);
    }


}
