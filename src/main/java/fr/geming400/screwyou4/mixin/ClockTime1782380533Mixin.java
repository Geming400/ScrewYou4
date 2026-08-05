package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestEnvironmentDefinition.ClockTime.class)
public class ClockTime1782380533Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1127074504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127074504L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_646920558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646920558L))
            info.setReturnValue("Uydr\u5724!\u6548[Tak0U8|eJH\uB6D25AWGy@-@df}s3\u04BC0\u3518M'B!=tm^\u247E#6sA,aJk&Dn.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1820643275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820643275L))
            info.setReturnValue(-541076636);
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Object;", cancellable = true)
    private void setup__927395937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-927395937L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "setup(Lnet/minecraft/server/level/ServerLevel;)Ljava/lang/Long;", cancellable = true)
    private void setup__1955073150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955073150L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clock()Lnet/minecraft/core/Holder;", cancellable = true)
    private void clock__963710991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963710991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "time()I", cancellable = true)
    private void time_1820642779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820642779L))
            info.setReturnValue(-337929216);
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Long;)V", cancellable = true)
    private void teardown_210893048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210893048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "teardown(Lnet/minecraft/server/level/ServerLevel;Ljava/lang/Object;)V", cancellable = true)
    private void teardown__1035056235(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1035056235L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__776733039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776733039L))
            info.setReturnValue(null);
    }


}
