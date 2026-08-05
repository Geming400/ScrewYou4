package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPattern.class)
public class BannerPattern_500565082Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1886077340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886077340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__634894894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634894894L))
            info.setReturnValue("7k2\u0B76{&PbL)pa:KM#LHhQh'^zyGy-aTa6CILaU[]R\u030A\u1FEBK=\u9240");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_538827823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538827823L))
            info.setReturnValue(-346115023);
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey__634895390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634895390L))
            info.setReturnValue("\u7A52?#LH\uB048%T?\uBB1C\"\u3925cKJ\u13E8VN*DY\uFBF7\uCB51W)Ux8:K$G\u5AB0'gy(\u5F1Fx(*e?\u726Aw`ut\uAFD9Qd%'xnrhe9wRpttQ56\u97C22Rko-RFYR(cPh=#]ZW|`vw\uB2BC");
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1942501472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942501472L))
            info.setReturnValue(null);
    }


}
