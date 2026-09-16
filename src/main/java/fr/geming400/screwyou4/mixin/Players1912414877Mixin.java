package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.status.ServerStatus.Players.class)
public class Players1912414877Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1003788609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1003788609L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1612128894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1612128894L))
            info.setReturnValue("bD.N>\uA55F@Imn<<bT\u9E88P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1825200328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1825200328L))
            info.setReturnValue(-1998702993);
    }

    @Inject(at = @At("HEAD"), method = "max()I", cancellable = true)
    private void max__2027482721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2027482721L))
            info.setReturnValue(-1563632749);
    }

    @Inject(at = @At("HEAD"), method = "sample()Ljava/util/List;", cancellable = true)
    private void sample_955977079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955977079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "online()I", cancellable = true)
    private void online__1971438064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1971438064L))
            info.setReturnValue(-1495279070);
    }


}
