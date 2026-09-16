package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.number.UniformGenerator.class)
public class UniformGenerator341432925Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__567193343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567193343L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1111856450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111856450L))
            info.setReturnValue("\uA930\u6752EOwZ,8d'g3[D\u342AhR=L0q`\u37CF\"B%_lHtpo(\u61D3ZUSP(tLf\u0F1A?\uA0A5W{J\u844Cg_tLg]w<4QM%<\u5B53XWO)E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_898785016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898785016L))
            info.setReturnValue(609023902);
    }

    @Inject(at = @At("HEAD"), method = "min()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void min_1474141953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474141953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "max()Lnet/minecraft/world/level/storage/loot/providers/number/NumberProvider;", cancellable = true)
    private void max__1746664685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1746664685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(Lnet/minecraft/world/level/storage/loot/LootContext;)I", cancellable = true)
    private void getInt_1073392265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073392265L))
            info.setReturnValue(-623709381);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(Lnet/minecraft/world/level/storage/loot/LootContext;)F", cancellable = true)
    private void getFloat_111962105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(111962105L))
            info.setReturnValue(9.463054E8F);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__677285846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-677285846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "between(FF)Lnet/minecraft/world/level/storage/loot/providers/number/UniformGenerator;", cancellable = true)
    private static void between__846853142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-846853142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1407878179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407878179L))
            info.setReturnValue(null);
    }


}
