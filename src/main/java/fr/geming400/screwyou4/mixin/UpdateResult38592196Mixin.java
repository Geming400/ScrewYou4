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
            info.setReturnValue(";Oꝩy`!}Xꟈj=7^;?6bPGu쬏h _=tJj灯&8^B}HQ3MZh!FaD胓뭈Vq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_76854938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76854938L))
            info.setReturnValue(-1002953056);
    }

    @Inject(at = @At("HEAD"), method = "providerId()Ljava/lang/String;", cancellable = true)
    private void providerId__1096868275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096868275L))
            info.setReturnValue("귐=FhbℵN쾴}㳵]$^T%Z?@FvA=\"h臠E:7RC8M)XMqi8+oOᦋ 6'!*iO ?w< VTs]В+;t궲|阍5f{jQzA$艧x[%zOAx_o0]");
    }

    @Inject(at = @At("HEAD"), method = "writes()I", cancellable = true)
    private void writes_76854442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76854442L))
            info.setReturnValue(-824429566);
    }


}
