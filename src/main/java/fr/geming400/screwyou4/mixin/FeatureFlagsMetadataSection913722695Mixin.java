package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.FeatureFlagsMetadataSection.class)
public class FeatureFlagsMetadataSection913722695Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1995732342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995732342L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__221737280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221737280L))
            info.setReturnValue("{Fqoux%@s'\u7CFE\u2A70L\uB042{[r)1YqAcZ4CdFe>jzD*2k\u7AE2.qU48W;w8km*\u1BD4&m0\u276C\u738A`rd>>Z:tyrG^QU\uA049hNMz%^4ho(0j\u0B5F8e{\u66F9i\u1970g|uXnBwdQ");
    }

    @Inject(at = @At("HEAD"), method = "flags()Lnet/minecraft/world/flag/FeatureFlagSet;", cancellable = true)
    private void flags_1578543193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1578543193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_951985437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951985437L))
            info.setReturnValue(1841075595);
    }


}
