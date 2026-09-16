package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.TagValueOutput.EncodeToMapFailedProblem.class)
public class EncodeToMapFailedProblem_721558995Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/Object;", cancellable = true)
    private void value__281961954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281961954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__187067274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-187067274L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1491982519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1491982519L))
            info.setReturnValue("Mi4);MY}P\u6504HvI5e\u512Ap{W\"Aj&w r|+#xE\u47A0\u7681Qr/XIZ`At=a_>Z0ZIE5VTHp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1278911085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278911085L))
            info.setReturnValue(-1816214438);
    }

    @Inject(at = @At("HEAD"), method = "error()Lcom/mojang/serialization/DataResult$Error;", cancellable = true)
    private void error__1764700299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1764700299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__452428713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-452428713L))
            info.setReturnValue("=YN@o\uA0D7|/$9\u41BBb\u493Dg");
    }


}
