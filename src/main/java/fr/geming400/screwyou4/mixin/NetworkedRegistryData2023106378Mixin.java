package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.resources.RegistryDataLoader.NetworkedRegistryData.class)
public class NetworkedRegistryData2023106378Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1114480110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114480110L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1501437393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501437393L))
            info.setReturnValue("FO[zMf7}yc\uACC4E^\uD1FD<\uA15CXBTpgG06Jv^\uC1D8ez<W}.^8j/x9\u4DFA\uAD5AVVl)3z`}A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1714508827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714508827L))
            info.setReturnValue(-695631369);
    }

    @Inject(at = @At("HEAD"), method = "elements()Ljava/util/List;", cancellable = true)
    private void elements__121916175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-121916175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tags()Lnet/minecraft/tags/TagNetworkSerialization$NetworkPayload;", cancellable = true)
    private void tags_1355716107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355716107L))
            info.setReturnValue(null);
    }


}
