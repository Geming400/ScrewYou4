package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.LevelVersion.class)
public class LevelVersion_1645275876Mixin {
        @Inject(at = @At("HEAD"), method = "snapshot()Z", cancellable = true)
    private void snapshot__1504631466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504631466L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/serialization/Dynamic;)Lnet/minecraft/world/level/storage/LevelVersion;", cancellable = true)
    private static void parse__1261123654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261123654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastPlayed()J", cancellable = true)
    private void lastPlayed__359157471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359157471L))
            info.setReturnValue(-3129004476543795387L);
    }

    @Inject(at = @At("HEAD"), method = "levelDataVersion()I", cancellable = true)
    private void levelDataVersion_650139487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(650139487L))
            info.setReturnValue(-2109051158);
    }

    @Inject(at = @At("HEAD"), method = "minecraftVersion()Lnet/minecraft/world/level/storage/DataVersion;", cancellable = true)
    private void minecraftVersion__10064194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-10064194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minecraftVersionName()Ljava/lang/String;", cancellable = true)
    private void minecraftVersionName__1618451070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618451070L))
            info.setReturnValue("L-W1s$?\u2F81xtO|\u5C0F::txp<l=jfL##r;Ij 2 }\uCB32I1v6]cs^mRh)Dr?pLg.2=nle*6? a-/L\u5F8AB-8{");
    }


}
