package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.BlockStateModelLoader.LoadedModels.class)
public class LoadedModels_1439850173Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1469604865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469604865L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_304390197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304390197L))
            info.setReturnValue("\u1070Q3 |[\u7ABA5\u98C8\u6836%I;]2z:#tF}=;V|q!S_\uFD8B\u12D1u?/!>)8z&BgK=B\u6BEE?1\uD476xu>^,<\u9839c5\u2909\u2E59]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1478112914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1478112914L))
            info.setReturnValue(-1761271344);
    }

    @Inject(at = @At("HEAD"), method = "models()Ljava/util/Map;", cancellable = true)
    private void models__564773468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-564773468L))
            info.setReturnValue(null);
    }


}
