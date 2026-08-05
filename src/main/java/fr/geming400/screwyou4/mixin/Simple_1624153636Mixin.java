package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.Configuration.Simple.class)
public class Simple_1624153636Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_715527367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(715527367L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1900390136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1900390136L))
            info.setReturnValue("qF\u07F0k5*<\u9A83-&o8'LCDo<sWOwu4=^TeST&RCiSt\u2ECDNON$`XZ5\u1449<gt*8b");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2113461570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113461570L))
            info.setReturnValue(-334854424);
    }

    @Inject(at = @At("HEAD"), method = "factory()Lnet/minecraft/world/level/chunk/Palette$Factory;", cancellable = true)
    private void factory__726181958(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-726181958L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bits()I", cancellable = true)
    private void bits_2100593347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2100593347L))
            info.setReturnValue(-962946773);
    }

    @Inject(at = @At("HEAD"), method = "bitsInMemory()I", cancellable = true)
    private void bitsInMemory__80022051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-80022051L))
            info.setReturnValue(-1389695166);
    }

    @Inject(at = @At("HEAD"), method = "alwaysRepack()Z", cancellable = true)
    private void alwaysRepack_534608639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534608639L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createPalette(Lnet/minecraft/world/level/chunk/Strategy;Ljava/util/List;)Lnet/minecraft/world/level/chunk/Palette;", cancellable = true)
    private void createPalette__1032609286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1032609286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bitsInStorage()I", cancellable = true)
    private void bitsInStorage_1789396697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789396697L))
            info.setReturnValue(2031130705);
    }


}
