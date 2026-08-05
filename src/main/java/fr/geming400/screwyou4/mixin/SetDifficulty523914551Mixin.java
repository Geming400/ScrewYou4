package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.SetDifficulty.class)
public class SetDifficulty523914551Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__384711717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-384711717L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1294338076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1294338076L))
            info.setReturnValue("Z\u4CDA[o3G^\u80FE\uAA27adq]ccIX,I10GGO\uB686@YW.\u3219P7;dq]2[lOoqQ0wz\u7D84mn!faY");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1081266642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081266642L))
            info.setReturnValue(-814982441);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__1505447266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505447266L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void setup_616761957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616761957L))
            info.setReturnValue(net.minecraft.world.Difficulty.PEACEFUL);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown_1147243091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1147243091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/Difficulty;)V", cancellable = true)
    private void teardown_453912154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(453912154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1590359805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1590359805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "difficulty()Lnet/minecraft/world/Difficulty;", cancellable = true)
    private void difficulty_730635668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730635668L))
            info.setReturnValue(net.minecraft.world.Difficulty.NORMAL);
    }


}
