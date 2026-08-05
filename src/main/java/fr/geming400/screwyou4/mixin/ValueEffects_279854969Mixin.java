package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AllOf.ValueEffects.class)
public class ValueEffects_279854969Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1665367227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1665367227L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__855605007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855605007L))
            info.setReturnValue("{迡ꨗ#4{4곸6)ao-hf鉏MM誏S蚙R(9Zd_%;d9Md<49䕙2wY ]'6T전TyE*v佗X惿-?[v纉痨FG覐묆");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_318117710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(318117710L))
            info.setReturnValue(-1597760438);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process_1171446954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1171446954L))
            info.setReturnValue(7.598474E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2015708692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2015708692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effects()Ljava/util/List;", cancellable = true)
    private void effects_1906191784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906191784L))
            info.setReturnValue(null);
    }


}
