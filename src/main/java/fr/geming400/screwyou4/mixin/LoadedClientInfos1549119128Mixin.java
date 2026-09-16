package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.ClientItemInfoLoader.LoadedClientInfos.class)
public class LoadedClientInfos1549119128Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_640492860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(640492860L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1975424643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1975424643L))
            info.setReturnValue("D'Q6v6_DLiwQh^&Bn2P");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2106471219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106471219L))
            info.setReturnValue(-1498455669);
    }

    @Inject(at = @At("HEAD"), method = "contents()Ljava/util/Map;", cancellable = true)
    private void contents__1343350746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1343350746L))
            info.setReturnValue(null);
    }


}
