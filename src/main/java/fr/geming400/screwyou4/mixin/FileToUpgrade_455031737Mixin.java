package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.FileToUpgrade.class)
public class FileToUpgrade_455031737Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1840543995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1840543995L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__680428239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680428239L))
            info.setReturnValue("_e*q\"p;0\u17B8]0!-);\uBD20bD,\u98F6-nRc&@jJ<k<Kzw;j\u47B5mn:/0r\uC32C$yL\uD142bUM\u46400\u14EEB2C@\u1BF3Tzz%7bt\u6DC7Nsf:As");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_493294478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493294478L))
            info.setReturnValue(-789534275);
    }

    @Inject(at = @At("HEAD"), method = "file()Lnet/minecraft/world/level/chunk/storage/RegionFile;", cancellable = true)
    private void file_1822364196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822364196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chunksToUpgrade()Ljava/util/List;", cancellable = true)
    private void chunksToUpgrade_2081368552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2081368552L))
            info.setReturnValue(null);
    }


}
