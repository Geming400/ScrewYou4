package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.HashCache.UpdateResult.class)
public class UpdateResult38592196Mixin {
        @Inject(at = @At("HEAD"), method = "cache()Lnet/minecraft/data/HashCache$ProviderCache;", cancellable = true)
    private void cache_2032813186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032813186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1424104455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424104455L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1096867779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096867779L))
            info.setReturnValue(";O\uA769y`!}X\uA7C8j=7^;?6bPGu\uCB0Fh _=tJj\u706F&8^B}HQ3MZh!FaD\u80D3\uBB48Vq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_76854938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76854938L))
            info.setReturnValue(-1566985556);
    }

    @Inject(at = @At("HEAD"), method = "providerId()Ljava/lang/String;", cancellable = true)
    private void providerId__1096868275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096868275L))
            info.setReturnValue("\uADD0=Fhb\u2135N\uCFB4}\u3CF5]$^T%Z?@FvA=\"h\u81E0E:7RC8M)XMqi8+oO\u198B 6'!*iO ?w< VTs]\u0412+;t\uADB2|\u960D5f{jQzA$\u8267x[%zOAx_o0]");
    }

    @Inject(at = @At("HEAD"), method = "writes()I", cancellable = true)
    private void writes_76854442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76854442L))
            info.setReturnValue(-1388462066);
    }


}
